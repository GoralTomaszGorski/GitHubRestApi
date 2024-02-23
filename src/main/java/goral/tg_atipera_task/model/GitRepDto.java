package goral.tg_atipera_task.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GitRepDto {
    private String ownerLogin;
    private String repoName;
    private String branchName;
    private String lastCommitSha;
}
