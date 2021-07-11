package org.zerock.guestbook2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.zerock.guestbook2.entity.Guestbook;

public interface GuestbookRepository extends JpaRepository<Guestbook, Long>
, QuerydslPredicateExecutor<Guestbook> {

}
