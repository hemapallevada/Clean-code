package com.codebin;
import java.io.File;
import java.util.AbstractList;
import java.util.logging.Logger;
import java.util.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;

import jdk.internal.jline.internal.Log;
public class HouseConstructionCost {

	public static  org.apache.log4j.Logger log1=LogManager.getLogger(HouseConstructionCost.class);


	
	public static float CalculateCostForConstruction(int choice,float area_of_construction) {
		
		int cost_per_sqfeet=0;
		switch(choice) {
		case 1:cost_per_sqfeet=1200;
			break;
		case 2:cost_per_sqfeet=1500;
		break;
		case 3:cost_per_sqfeet=1800;
		break;
		case 4:cost_per_sqfeet=2500;
		break;
		
	
}
		float total_cost_of_construction=cost_per_sqfeet*area_of_construction;
		return total_cost_of_construction; 
		
	}}