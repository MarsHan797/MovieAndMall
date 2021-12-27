package com.mars.service.Impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mars.entity.MallUserAddress;
import com.mars.mapper.MallUserAddressMapper;
import com.mars.service.MallUserAddressService;
import org.springframework.stereotype.Service;

@Service
public class MallUserAddressServiceImpl extends ServiceImpl<MallUserAddressMapper,MallUserAddress> implements MallUserAddressService {

}
