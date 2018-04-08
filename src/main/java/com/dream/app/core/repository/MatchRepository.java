package com.dream.app.core.repository;

import com.dream.app.core.domain.Match;

/**
 * Created by karthick 08/04/2018
 */
public interface MatchRepository extends BaseRepository<Match,Long> {

    public Match findByMatMatchNo(Long matMatchNo);

}
