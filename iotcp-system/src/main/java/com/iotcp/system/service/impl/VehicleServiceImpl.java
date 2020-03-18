package com.iotcp.system.service.impl;

import com.iotcp.system.domain.*;
import com.iotcp.system.mapper.VehicleMapper;
import com.iotcp.system.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleMapper vehicleMapper;

    @Override
    public List<objparkin> vehicleentryList(objparkinVO objparkinVO) {
        return vehicleMapper.vehicleentryList(objparkinVO);
    }

    @Override
    public List<objparkOut> vehicleexportList(objparkOutVO objparkOutVO) {
        return vehicleMapper.vehicleexportList(objparkOutVO);
    }

    @Override
    public List<vehicleclassifyconfigure> getVehicleclassifyconfigure(vehicleclassifyconfigure vehicleclassifyconfigure) {
        return vehicleMapper.getVehicleclassifyconfigure(vehicleclassifyconfigure);
    }

    @Override
    public int addVehicleclassifyconfigure(vehicleclassifyconfigure vehicleclassifyconfigure) {
        return vehicleMapper.addVehicleclassifyconfigure(vehicleclassifyconfigure);
    }

    @Override
    public int updateVehicleclassifyconfigure(vehicleclassifyconfigure vehicleclassifyconfigure) {
        return vehicleMapper.updateVehicleclassifyconfigure(vehicleclassifyconfigure);
    }

    @Override
    public int deleteVehicleclassifyconfigure(String id) {
        return vehicleMapper.deleteVehicleclassifyconfigure(id);
    }

    @Override
    public List<vehicleconfigureVo> getVehicleconfigure(vehicleconfigure vehicleconfigure) {
        return vehicleMapper.getVehicleconfigure(vehicleconfigure);
    }

    @Override
    public int addVehicleconfigure(vehicleconfigure vehicleconfigure) {
        return vehicleMapper.addVehicleconfigure(vehicleconfigure);
    }

    @Override
    public int updateVehicleconfigure(vehicleconfigure vehicleconfigure) {
        return vehicleMapper.updateVehicleconfigure(vehicleconfigure);
    }

    @Override
    public int deleteVehicleconfigure(String id) {
        return vehicleMapper.deleteVehicleconfigure(id);
    }

    @Override
    public List<vehicleReport> vehicleReport(String time) {
        return vehicleMapper.vehicleReport(time);
    }
}
