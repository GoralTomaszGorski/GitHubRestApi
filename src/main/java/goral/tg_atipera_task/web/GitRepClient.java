package goral.tg_atipera_task.web;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GitRepClient {

    //korzystam z RestTemplate ponieważ jest wbudowany w Spring pozwala na zamianę JSON na obiekty Java
    private final RestTemplate restTemplate = new RestTemplate();

    //wydzieliłem część adresu URL do stałej żeby było wygodniej
    private static final String GIT_FIRSTPART_URL = "https://api.github.com/";
    // https://api.github.com/users/GoralTomaszGorski/repos
    // https://api.github.com/repos/GoralTomaszGorski/psychotherapist_office/branches


    public String getGitRepForUserName(String userName) {
        return restTemplate.getForObject(GIT_FIRSTPART_URL
                        + "users/{userName}/repos",
                String.class,
                userName);
    }

    public String getGitBranchesForUserNameAndRepo(String userName, String repository){
        return restTemplate.getForObject(GIT_FIRSTPART_URL
                        + "repos/{userName}/{repository}/branches",
                String.class,
                userName, repository);
    }

    public String getGitBranchesForOwnerAndRepoTest(){
        return restTemplate.getForObject("https://api.github.com/repos/GoralTomaszGorski/psychotherapist_office/branches",
                String.class);
    }
}
