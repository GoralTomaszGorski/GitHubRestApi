package goral.tg_atipera_task.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ModelGitRep {
    private Long id; // Identyfikator repozytorium
    private String name; // Nazwa repozytorium
    private String full_name; // Pełna nazwa repozytorium
    //owner
    private String login;

}
