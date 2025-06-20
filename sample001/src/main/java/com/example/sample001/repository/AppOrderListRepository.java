package com.example.sample001.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample001.entity.AppOrderList;

public interface AppOrderListRepository extends JpaRepository<AppOrderList, Long> {
    // 必要に応じてカスタムクエリを追加する
}
