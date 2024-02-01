package com.uisrael.web.web.utils;


import java.util.List;



import com.google.gson.Gson;


public class ConvertJson<T> {
	
	private final Class<T> objectType;
	private final Gson gson;
	
	
		public ConvertJson (Class<T> objectType) {
			this.gson=  new Gson();
			this.objectType= objectType;
		}


		public List<T> convertJsonArray(List<String> listaStringJson) {
			// TODO Auto-generated method stub
			
			//List<T> listaT= new ArrayList<>();
			
			//for(String rString: listaStringJson) {
			//	T c2=gson.fromJson(rString, objectType);
			//	listaT.add(c2);
			//}
			//
			
			return gson.fromJson(listaStringJson.get(0), List.class);
		}
		
	

}
