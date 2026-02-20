package com.dalfran.Metoa.service.profil;

import com.dalfran.Metoa.classMapp.ProfilMapper;
import com.dalfran.Metoa.dto.profilDTO.ProfilReqDTO;
import com.dalfran.Metoa.dto.profilDTO.ProfilResDTO;
import com.dalfran.Metoa.entity.user.User;
import com.dalfran.Metoa.exception.ProfilNotFoundException;
import com.dalfran.Metoa.exception.UserNoteFoundException;
import com.dalfran.Metoa.repository.ProfilRepo;
import com.dalfran.Metoa.repository.UserRepo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class ProfilServiceImpl implements ProfilService{
    private final ProfilMapper profilMapper;
    private final ProfilRepo profilRepo;
    private final UserRepo userRepo;

    public ProfilServiceImpl(ProfilMapper profilMapper, ProfilRepo profilRepo, UserRepo userRepo) {
        this.profilMapper = profilMapper;
        this.profilRepo = profilRepo;
        this.userRepo = userRepo;
    }

    @Override
    public ProfilResDTO getProfilByUserId(String userId) {

        User user = this.userRepo.findById(userId)
                .orElseThrow(()-> new UserNoteFoundException(userId));

        if (user.getProfil() == null) {
            throw new ProfilNotFoundException("Cet utilisateur n'a pas encore de profil");
        }
        return this.profilMapper.toResDTO(user.getProfil());
    }

    @Override
    public void updateProfilByUserId(String userId, ProfilReqDTO profilReqDTO) {
        User user = userRepo.findById(userId)
                .orElseThrow(() -> new UserNoteFoundException(userId));

        if (user.getProfil() == null) {
            throw new ProfilNotFoundException("Impossible de modifier : aucun profil existant");
        }


        profilMapper.updateProfilFromDTO(profilReqDTO, user.getProfil());

        this.userRepo.save(user);


    }

    @Override
    public void deleteProfilByUserId(String userId) {
        User user = this.userRepo.findById(userId)
                .orElseThrow(()-> new UserNoteFoundException(userId));


        if (user.getProfil() == null) {
            throw new RuntimeException("Aucun profil à supprimer");
        }
        user.setProfil(null);
        this.userRepo.save(user);

    }
}
