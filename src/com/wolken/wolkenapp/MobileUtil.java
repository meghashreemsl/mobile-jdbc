package com.wolken.wolkenapp;

import java.util.Scanner;

import com.wolken.wolkenapp.dto.MobileDTO;
import com.wolken.wolkenapp.mobile.Mobile;



public class MobileUtil {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = scanner.nextInt();
		
		Mobile mobile = new Mobile(size);
		
		for(int i=0; i < size; i++) {
		
			System.out.println("Enter the Serial No");
			int serialNo= scanner.nextInt();
			
			System.out.println("Enter the Mobile ID");
			int mobileId= scanner.nextInt();
			
			System.out.println("Enter the Model Name ");
			String modelName= scanner.next();
	
			System.out.println("Enter the price");
			Double price= scanner.nextDouble();
			
			System.out.println("Enter the memory");
			int memory= scanner.nextInt();
			
			System.out.println("Enter the Brand Name");
			String brandName= scanner.next();
			
			System.out.println("Enter the no of cameras");
			int noOfCameras= scanner.nextInt();
			
			MobileDTO mobileDTO = new MobileDTO();
			mobileDTO.setSerialNo(serialNo);
			mobileDTO.setMobileId(mobileId);
			mobileDTO.setModelName(modelName);
			mobileDTO.setPrice(price);
			mobileDTO.setMemory(memory);
			mobileDTO.setBrandName(brandName);
			mobileDTO.setNoOfCamera(noOfCameras);
			
			mobile.addMobiles(mobileDTO);
			
		}
	
		// get all data
		mobile.getMobileDetails();
		try {
		  mobile.deleteByMobileId(32); 
		}
		catch(Exception e) {
			e.getMessage();
		}

		//update name by serial no 
		
		  MobileDTO mobileDTO = mobile.updateNameBySerialNo("redmi", 30);
		  System.out.println("updated serial no: "+mobileDTO.getSerialNo()+" "+mobileDTO.getModelName());
		  
		
		// get all data by brand name
		
		  MobileDTO mobileDTO1 = mobile.getAllByBrandName("xiaomi");
		  System.out.println(mobileDTO1.getBrandName()+" "+
		           mobileDTO1.getMobileId()+" "+
					mobileDTO1.getSerialNo()+" "+
					mobileDTO1.getMemory()+" "+
				    mobileDTO1.getModelName()+" "+
					mobileDTO1.getNoOfCameras()+" "+
				    mobileDTO1.getPrice());
		
		  
			// delete by mobile id
		  mobile.getMobileDetails();
			
		  mobile.deleteByMobileId(32); 
		 
	}
  }


