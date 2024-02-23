package goral.tg_atipera_task.service;

import goral.tg_atipera_task.model.GitRepDto;
import goral.tg_atipera_task.web.GitRepClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class GitRepService {

    private final GitRepClient gitRepClient;

    public GitRepDto getGitReposAndBranches(){
        String response = gitRepClient.getGitRepForUserName("GoralTomaszGorski");
        log.info(response);
        response = gitRepClient.getGitBranchesForUserNameAndRepo("GoralTomaszGorski", "psychotherapist_office");
        log.info(response);
    return null;
    }

    public GitRepDto getGitRep(){
        String response = gitRepClient.getGitRepForUserName("GoralTomaszGorski");
        log.info(response);
    return null;
    }

    public GitRepDto getGitBranches(){
        String response = gitRepClient.getGitBranchesForUserNameAndRepo("GoralTomaszGorski", "psychotherapist_office");
        log.info(response);
        return null;
    }

    public GitRepDto getGitBranchesTest(){
        String response = gitRepClient.getGitBranchesForOwnerAndRepoTest();
        log.info(response);
        return null;
    }
}
