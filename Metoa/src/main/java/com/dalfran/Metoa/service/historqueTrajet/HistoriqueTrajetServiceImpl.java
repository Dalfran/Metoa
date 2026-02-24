package com.dalfran.Metoa.service.historqueTrajet;

import com.dalfran.Metoa.classMapp.HistoriqueTrajetMapper;
import com.dalfran.Metoa.dto.historiqueTrajetDTO.HistoriqueTrajetResDTO;
import com.dalfran.Metoa.entity.historiqueTrajet.HistoriqueTrajet;
import com.dalfran.Metoa.entity.historiqueTrajet.StatusTrajet;
import com.dalfran.Metoa.exception.NotFoundTrjetException;
import com.dalfran.Metoa.repository.HistoriqueTrajetRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriqueTrajetServiceImpl implements HistoriqueTrajetService{

    private final HistoriqueTrajetRepo historiqueTrajetRepo;
    private  final HistoriqueTrajetMapper historiqueTrajetMapper;

    public HistoriqueTrajetServiceImpl(HistoriqueTrajetRepo historiqueTrajetRepo, HistoriqueTrajetMapper historiqueTrajetMapper) {
        this.historiqueTrajetRepo = historiqueTrajetRepo;
        this.historiqueTrajetMapper = historiqueTrajetMapper;
    }


    @Override
    public List<HistoriqueTrajetResDTO> getFindByUserIdAndStatusTrajet(String idUser, StatusTrajet statusTrajet) {
        List<HistoriqueTrajet> trajets = this.historiqueTrajetRepo.findByUser_IdUserAndStatusTrajet(idUser,statusTrajet);

        if (trajets.isEmpty()) {
            throw new NotFoundTrjetException("Aucun trajet trouvé pour cet utilisateur");
        }

        return historiqueTrajetMapper.toResDTOList(trajets);
    }
}
