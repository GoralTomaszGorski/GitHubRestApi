package goral.tg_atipera_task.controller;

import goral.tg_atipera_task.model.GitRepDto;
import goral.tg_atipera_task.service.GitRepService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GitRepController {

    private final GitRepService gitRepService;

    @GetMapping("/gitrepos")
    public GitRepDto getGitRepos(){
        return gitRepService.getGitRep();
    }

    @GetMapping("/gitbranches")
    public GitRepDto getGitBranches(){
        return gitRepService.getGitBranches();
    }

    @GetMapping("/gittest")
    public GitRepDto getGitBranches2(){
        return gitRepService.getGitBranchesTest();
    }

    @GetMapping("/gitReposAndBranches")
    public GitRepDto gitReposAndBranches(){
        return gitRepService.getGitReposAndBranches();
    }
}
