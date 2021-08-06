package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.MenuEntity;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, Long>{

}
