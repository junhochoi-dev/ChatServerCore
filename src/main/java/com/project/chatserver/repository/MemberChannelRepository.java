package com.project.chatserver.repository;

import com.project.chatserver.domain.MemberChannel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberChannelRepository extends JpaRepository<MemberChannel, Long> {
    List<MemberChannel> findAllByMemberId(Long memberId);
}
