package com.dream.app.core.service;

import com.dream.app.core.domain.Match;
import com.dream.app.rest.resource.MatchResource;

public interface MatchService extends BaseService<Match> {

    public Match saveMatchDetail(MatchResource matchResource) throws Exception;
}
