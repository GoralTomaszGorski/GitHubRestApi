package goral.tg_atipera_task.controller;

import goral.tg_atipera_task.model.ModelGitRep;
import goral.tg_atipera_task.service.GitRepService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GitRepController {

    private final GitRepService gitRepService;

    @GetMapping("/gitrepos/{userName}")
    public ModelGitRep getGitRepos(@PathVariable String userName){
        return gitRepService.getGitRep(userName);
    }

    @GetMapping("/gitbranches")
    public ModelGitRep getGitBranches(){
        return gitRepService.getGitBranches();
    }


}
