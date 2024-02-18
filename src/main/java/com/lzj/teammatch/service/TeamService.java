package com.lzj.teammatch.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzj.teammatch.model.domain.Team;
import com.lzj.teammatch.model.domain.User;
import com.lzj.teammatch.model.dto.TeamQuery;
import com.lzj.teammatch.model.request.TeamJoinRequest;
import com.lzj.teammatch.model.request.TeamQuitRequest;
import com.lzj.teammatch.model.request.TeamUpdateRequest;
import com.lzj.teammatch.model.vo.TeamUserVO;

import java.util.List;

/**
 * 队伍服务
 */
public interface TeamService extends IService<Team> {

    /**
     * 创建队伍
     *
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);

    /**
     * 搜索队伍
     *
     * @param teamQuery
     * @param isAdmin
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 更新队伍
     *
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    /**
     * 加入队伍
     *
     * @param teamJoinRequest
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     *
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    /**
     * 删除（解散）队伍
     *
     * @param id
     * @param loginUser
     * @return
     */
    boolean deleteTeam(long id, User loginUser);
}
