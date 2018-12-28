package com.amine.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.amine.dao.Personeldao;
import com.amine.model.Personel;

public class PersoneldaoImpl implements Personeldao {

	private Connection baglanti =null;
	private String Sqlkodu = null;
	private DataSource verikaynagi;
	
	
	@Override
	public void Ekle(Personel personel) {
		Sqlkodu ="INSERT INTO `personel`(`adi`, `soyadi`, `tecrube`)"
				  + " VALUES (?,?,?)";
		Connection baglanti = null;
		try {
			
			baglanti = verikaynagi.getConnection();
			
			PreparedStatement preparedstatement = baglanti.prepareStatement(Sqlkodu);
			preparedstatement.setString(1,personel.getAdi());
			preparedstatement.setString(2,personel.getSoyadi());
			preparedstatement.setInt(3,personel.getTecrube());
			
			preparedstatement.executeUpdate();
			preparedstatement.close();
			
		}catch(SQLException e){
			throw new RuntimeException();
		}
		finally {
			if(baglanti != null) {
				try {
				baglanti.close();
				}catch(SQLException e) {
					
				}
			
		}
	}
			
	}

	@Override
	public Personel idAra(int id) {
		Sqlkodu ="SELECT * FROM `personel`"
				+ " Where id=? ";
		Connection baglanti = null;
		try {
			
			baglanti = verikaynagi.getConnection();
			
			PreparedStatement preparedstatement = baglanti.prepareStatement(Sqlkodu);
			preparedstatement.setInt(1, id);
			
			
			preparedstatement.executeUpdate();
			Personel personel = null;
			
			ResultSet resultset = preparedstatement.executeQuery();
			if(resultset.next()) {
				personel = new Personel(resultset.getInt("id"), resultset.getString("adi"), resultset.getString("soyadi"), resultset.getInt("tecrube"));
			}
			resultset.close();
			preparedstatement.close();
			
			return personel;
		}catch(SQLException e){
			throw new RuntimeException();
		}
		finally {
			if(baglanti != null) {
				try {
				baglanti.close();
				}catch(SQLException e) {
					
				}
			
		}
			
	}
			
	}

	@Override
	public Personel adiAra(String adi) {
		Sqlkodu ="SELECT * FROM `personel`"
				+ " Where adi=? ";
		Connection baglanti = null;
		try {
			
			baglanti = verikaynagi.getConnection();
			
			PreparedStatement preparedstatement = baglanti.prepareStatement(Sqlkodu);
			preparedstatement.setString(1, adi);
			
			
			preparedstatement.executeUpdate();
			Personel personel = null;
			
			ResultSet resultset = preparedstatement.executeQuery();
			if(resultset.next()) {
				personel = new Personel(resultset.getInt("id"), resultset.getString("adi"), resultset.getString("soyadi"), resultset.getInt("tecrube"));
			}
			resultset.close();
			preparedstatement.close();
			
			return personel;
		}catch(SQLException e){
			throw new RuntimeException();
		}
		finally {
			if(baglanti != null) {
				try {
				baglanti.close();
				}catch(SQLException e) {
					
				}
			
		}
		}
	}

	@Override
	public Personel soyadiAra(String soyadi) {
		Sqlkodu ="SELECT * FROM `personel`"
				+ " Where soyadi=? ";
		Connection baglanti = null;
		try {
			
			baglanti = verikaynagi.getConnection();
			
			PreparedStatement preparedstatement = baglanti.prepareStatement(Sqlkodu);
			preparedstatement.setString(1, soyadi);
			
			
			preparedstatement.executeUpdate();
			Personel personel = null;
			
			ResultSet resultset = preparedstatement.executeQuery();
			if(resultset.next()) {
				personel = new Personel(resultset.getInt("id"), resultset.getString("adi"), resultset.getString("soyadi"), resultset.getInt("tecrube"));
			}
			resultset.close();
			preparedstatement.close();
			
			return personel;
		}catch(SQLException e){
			throw new RuntimeException();
		}
		finally {
			if(baglanti != null) {
				try {
				baglanti.close();
				}catch(SQLException e) {
					
				}
			
		}
		}
	}

	@Override
	public Personel tecrubeAra(int tecrube) {
		Sqlkodu ="SELECT * FROM `personel`"
				+ " Where tecrube=? ";
		Connection baglanti = null;
		try {
			
			baglanti = verikaynagi.getConnection();
			
			PreparedStatement preparedstatement = baglanti.prepareStatement(Sqlkodu);
			preparedstatement.setInt(1, tecrube);
			
			
			preparedstatement.executeUpdate();
			Personel personel = null;
			
			ResultSet resultset = preparedstatement.executeQuery();
			if(resultset.next()) {
				personel = new Personel(resultset.getInt("id"), resultset.getString("adi"), resultset.getString("soyadi"), resultset.getInt("tecrube"));
			}
			resultset.close();
			preparedstatement.close();
			
			return personel;
		}catch(SQLException e){
			throw new RuntimeException();
		}
		finally {
			if(baglanti != null) {
				try {
				baglanti.close();
				}catch(SQLException e) {
					
				}
			
		}
		}
	}
	

}
