package com.api.conselharia.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.conselharia.Model.Conselho;

@Repository
public interface ConselhoRepository extends JpaRepository <Conselho, Long>{
    


}
