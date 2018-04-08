package com.dream.app.core.service.impl;

import com.dream.app.core.domain.Match;
import com.dream.app.core.repository.BaseRepository;
import com.dream.app.core.repository.MatchRepository;
import com.dream.app.core.service.MatchService;
import com.dream.app.rest.resource.MatchResource;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchServiceImpl extends BaseServiceImpl<Match> implements MatchService {

    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private Mapper mapper;

    public MatchServiceImpl(){ super(Match.class); }

    @Override
    protected BaseRepository<Match,Long> getDao() {
        return matchRepository;
    }



    @Override
    public Match saveMatchDetail(MatchResource matchResource) throws Exception{

        Match match = mapper.map(matchResource,Match.class);

        match= matchRepository.save(match);

        return match;
    }

}
