package com.soap.manager.impl;

import com.soap.entity.User;
import com.soap.mapper.UserMapper;
import com.soap.manager.UserManager;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表-MS 服务实现类
 * </p>
 *
 * @author ZhangPY
 * @since 2020-05-28
 */
@Service
public class UserManagerImpl extends ServiceImpl<UserMapper, User> implements UserManager {

}
