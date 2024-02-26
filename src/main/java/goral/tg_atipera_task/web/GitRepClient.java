package goral.tg_atipera_task.web;

import goral.tg_atipera_task.model.ModelGitRep;
import goral.tg_atipera_task.web.dto.Root;
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



    public ModelGitRep getGitRepForUserName(String userName) {
        Root root = callGetMethod(GIT_FIRSTPART_URL
                        + "users/{userName}/repos",
                Root.class,
                userName);
        return ModelGitRep.builder()
                .name(root.name)
                .full_name(root.full_name)
                .login(root.owner.login)
                .build();
    }

    public String getGitBranchesForUserNameAndRepo(String userName, String repository){
        return callGetMethod( "repos/{userName}/{repository}/branches",
                String.class,
                userName, repository);
    }

    private <T> T callGetMethod(String url, Class<T> responseType, Object...objects) {
        return restTemplate.getForObject(GIT_FIRSTPART_URL
                        + url,
                responseType,
                objects);
    }

}
