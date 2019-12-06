package cn.rpy.realm;

import cn.rpy.domain.User;
import cn.rpy.service.PermissionService;
import cn.rpy.service.RoleService;
import cn.rpy.service.UserService;
import cn.rpy.utils.ActivierUser;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

public class UserRealm extends AuthorizingRealm {


    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PermissionService permissionService;

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username=authenticationToken.getPrincipal().toString();
        //根据用户名查询用户
        User user = this.userService.queryUserByUserName(username);
        if(null !=user){
            //查询角色
            List<String> roles = this.roleService.queryRolesByUserId(user.getUserid());
            //查询权限
            List<String> permissions = this.permissionService.queryPermissionsByUserId(user.getUserid());
            ActivierUser activierUser=new ActivierUser(user,roles,permissions);
            ByteSource source=ByteSource.Util.bytes(user.getUsername()+user.getAddress());
            SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(activierUser,user.getUserpwd(),source,getName());
            return info;
        }
        return null;
    }


    /**
     * 授权
     * @param principalCollection
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        ActivierUser activierUser = (ActivierUser) principalCollection.getPrimaryPrincipal();
        List<String> persmissions = activierUser.getPermissions();
        List<String> roles = activierUser.getRoles();
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        if(null !=roles && roles.size()>0) {
           info.addRoles(roles);
        }
        if(null !=persmissions && persmissions.size()>0) {
            info.addStringPermissions(persmissions);
        }

        return info;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
