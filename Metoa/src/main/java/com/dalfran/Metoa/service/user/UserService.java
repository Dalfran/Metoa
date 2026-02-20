package com.dalfran.Metoa.service.user;

import com.dalfran.Metoa.dto.userDTO.UserReqDTO;
import com.dalfran.Metoa.dto.userDTO.UserResDTO;

public interface UserService {
    void createUser(UserReqDTO userReqDTO);
    UserResDTO getFindByIdUser(String idUser );
    void UpdateUser(UserReqDTO userReqDTO, String idUser);
    void deleteUser(String idUser);
}
