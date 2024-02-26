package goral.tg_atipera_task.service;

import goral.tg_atipera_task.model.ModelGitRep;
import goral.tg_atipera_task.web.GitRepClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Slf4j
@RequiredArgsConstructor
public class GitRepService {

    private final GitRepClient gitRepClient;

    public ModelGitRep getGitRep(String userName){
        return gitRepClient.getGitRepForUserName(userName);
    }


    public ModelGitRep getGitBranches(){
        String response = gitRepClient.getGitBranchesForUserNameAndRepo("GoralTomaszGorski", "psychotherapist_office");
        log.info(response);
        return null;
    }
}
