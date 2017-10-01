package security;

import mapper.AdminMapper;
import model.Admin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by joy12 on 2017/10/1.
 */
@Service("MyUserDetailsService")
public class MyUserDetailsService implements UserDetailsService{
    @Resource
    private AdminMapper adminMapper;

    @Override
    public UserDetails loadUserByUsername(String adminname) throws UsernameNotFoundException {
        Admin adminUser = adminMapper.selectByAdminname(adminname);

        if(adminUser == null) {
            throw new UsernameNotFoundException("用户" + adminname + " 不存在!");
        } else {
            String[] roles = adminUser.getRole().split(",");
            Set<GrantedAuthority> authorities = new HashSet<>();

            for(String role : roles)
            {
                authorities.add(new SimpleGrantedAuthority(role));
            }

            User userDetail = new User(adminUser.getAdminname(),adminUser.getPassword(),authorities);

            return userDetail;
        }

    }
}
