package com.example.demo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class YamlPropertyRead {
	
	private String name;
    private Integer thread;
    private List<String> servers = new ArrayList<>();
    
    @Value("${spring.profiles.active}")
    private String spring;
    
    
   
    	
    	  
    
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getThread() {
		return thread;
	}


	public void setThread(Integer thread) {
		this.thread = thread;
	}


	public List<String> getServers() {
		return servers;
	}


	public void setServers(List<String> servers) {
		this.servers = servers;
	}


	


	public String getSpring() {
		return spring;
	}


	public void setSpring(String spring) {
		this.spring = spring;
	}


	@Override
	public String toString() {
		return "YamlPropertyRead [name=" + name + ", thread=" + thread + ", servers=" + servers + "]";
	}
	
    
    


}
