package com.cmpe202.HealthClubManagement.Dao;

import com.cmpe202.HealthClubManagement.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberDao extends JpaRepository<Member, Integer> {

    @Override
    Optional<Member> findById(Integer integer);

    Optional<Member> findByUsername(String userName);
}
