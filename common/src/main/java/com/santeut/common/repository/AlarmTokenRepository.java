package com.santeut.common.repository;

import com.santeut.common.entity.AlarmTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlarmTokenRepository extends JpaRepository<AlarmTokenEntity,Integer> {
    List<AlarmTokenEntity> findByIdIn(List<Integer> userIds);

    @Override
    void deleteById(Integer integer);
}
