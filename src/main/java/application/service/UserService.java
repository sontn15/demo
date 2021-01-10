package application.service;

import application.domain.UserChangePass;
import application.entity.PhysicalExamEntity;
import application.entity.RoleEntity;
import application.entity.UserEntity;
import application.utils.StatusRegisterUserEnum;

import java.util.List;
import java.util.TreeMap;

public interface UserService {

    StatusRegisterUserEnum registerNewUser(UserEntity userEntity);

    List<RoleEntity> getListRoleActiveOfUser(Long userId);

    List<PhysicalExamEntity> getAllPhysicalExamByUser(String username);

    PhysicalExamEntity findPhysicalById(Long physicalId);

    UserEntity getByUsername(String userName);

    void updateUserInfo(UserEntity userEntity);

    void changePasswordUser(UserChangePass userChangePass);

    TreeMap<String, Double> getStatisticHeightOfUser(String username);

    TreeMap<String, Double> getStatisticWeightOfUser(String username);

    long getTotalQuantityExaminationOfUser(String username);

    PhysicalExamEntity getPhysicalLastOfUser(String username);

}
