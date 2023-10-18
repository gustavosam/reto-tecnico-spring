package com.demo.divisas.service;

import com.demo.divisas.entities.UserEntity;
import com.demo.divisas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    UserEntity userEntity = userRepository.findByUserName(username);

    List<GrantedAuthority> authorities = userEntity.getRoles()
            .stream()
            .map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());

    return new User(userEntity.getUserName(), userEntity.getPassword(),true, true, true, true, authorities);
  }
}
