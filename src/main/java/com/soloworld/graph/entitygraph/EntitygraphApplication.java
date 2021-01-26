package com.soloworld.graph.entitygraph;

import com.soloworld.graph.entitygraph.configuration.service.LandService;
import com.soloworld.graph.entitygraph.entity.Fruit;
import com.soloworld.graph.entitygraph.entity.Land;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class EntitygraphApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EntitygraphApplication.class, args);
	}
@Autowired
  LandService landService;

	@Override
	public void run(String... args) throws Exception {
		Land landList = landService.getLands();


			System.out.println("land id "+ landList.getFruitSet().size());
		System.out.println("-------------------------------------------");
		List<Land> lands = landService.getAllLands();
		for(Land land:lands) {
			System.out.println("size of fruits"+ land.getFruitSet().size());
		}
		}
	}

