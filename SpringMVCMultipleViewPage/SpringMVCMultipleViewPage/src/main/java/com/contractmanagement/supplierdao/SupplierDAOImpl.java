package com.contractmanagement.supplierdao;

//import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.contractmanagement.roleselection.Supplier;

public class SupplierDAOImpl implements SupplierDAO {
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/*public SupplierDAOImpl(DataSource dataSource)
	{
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}*/
	/*public int save(Supplier supplier) {
		String sql="insert into supplier(FirstName,LastName,Age,Gender,ContactNumber,SuppilerId,Password)values(?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,supplier.getFirstName(),supplier.getLastName(),supplier.getAge(),supplier.getGender(),supplier.getContactNumber(),supplier.getSupplierId(),supplier.getPassword());
		
	}*/
	public int save(com.contractmanagement.roleselection1.Supplier supplier) {
		String sql="insert into supplier(FirstName,LastName,Age,Gender,ContactNumber,SuppilerId,Password)values(?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,supplier.getFirstName(),supplier.getLastName(),supplier.getAge(),supplier.getGender(),supplier.getContactNumber(),supplier.getSupplierId(),supplier.getPassword());
		
	}
}
