package com.uninpahu.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uninpahu.repository.EstudianteDto;


@Service
public class QueryByStudent {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@SuppressWarnings("unchecked")
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void patchEstudiante(EstudianteDto data, int id) {
		this.jdbcTemplate.update("UPDATE  estudiante e join usuario u on e.id_usuario = u.usuario_id "
				+ "join tipo_documento td on u.id_tipo_documento = td.tipo_documento_id "
				+ "join ciudad c on u.id_ciudad = c.ciudad_id "
				+ "join programa_academico pa on e.id_programa_academico = pa.programa_academico_id "
				+ "SET u.nombre_usuario = ?, u.apellido_usuario = ?, u.contrasena = ?, td.descripcion = ?,"
				+ "u.documento = ?, u.correo = ?, u.direccion = ?, c.nombre = ?, u.telefono = ?, e.tipo_sangre = ?,"
				+ "e.rh = ?, e.numero_pasaporte = ?, pa.nombre_programa = ?, e.nombre_acudiente = ?, e.numero_acudiente = ?, e.parentesco_acudiente = ?"
				+ "WHERE e.estudiante_id = ?", data.getNombre(), data.getApellido(), data.getContrasena(),
				data.getTipoDocumentoNombre(), data.getNumeroDocumento(), data.getCorreo(), data.getDireccion(),
				data.getCiudad(), data.getTelefono(), data.getTipoSangre(), data.getRh(), data.getPasaporte(),
				data.getProgramaAcademico(), data.getNombreAcudiente(), data.getTelefonoAcudiente(),
				data.getParentescoAcudiente(), id);
		
	}

	@SuppressWarnings("unchecked")
	public EstudianteDto traerDocumentoByEstudiante(int id) {

		StringBuilder query = new StringBuilder();
		query.append(
				"SELECT u.usuario_id, u.nombre_usuario, u.apellido_usuario, u.contrasena, td.descripcion, u.documento, u.correo,");
		query.append(
				"u.direccion, c.nombre, u.telefono, e.tipo_sangre, e.rh, e.numero_pasaporte, e.numero_acudiente, pa.nombre_programa,");
		query.append("e.nombre_acudiente, e.parentesco_acudiente FROM estudiante e ");
		query.append("join usuario u on e.id_usuario = u.usuario_id ");
		query.append("join tipo_documento td on u.id_tipo_documento = td.tipo_documento_id ");
		query.append("join ciudad c on u.id_ciudad = c.ciudad_id ");
		query.append("join programa_academico pa on e.id_programa_academico = pa.programa_academico_id ");
		query.append(" WHERE e.estudiante_id =");
		query.append(id);

		return jdbcTemplate.queryForObject(query.toString(), new EmployeeMapper());

	}

	private static final class EmployeeMapper implements RowMapper<EstudianteDto> {
		public EstudianteDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			EstudianteDto emp = new EstudianteDto();
			emp.setId(rs.getInt("usuario_id"));
			emp.setNombre(rs.getString("nombre_usuario"));
			emp.setApellido(rs.getString("apellido_usuario"));
			emp.setContrasena(rs.getString("contrasena"));
			emp.setTipoDocumentoNombre(rs.getString("descripcion"));
			emp.setNumeroDocumento(rs.getString("documento"));
			emp.setCorreo(rs.getString("correo"));
			emp.setDireccion(rs.getString("direccion"));
			emp.setCiudad(rs.getString("nombre"));
			emp.setTelefono(rs.getString("telefono"));
			emp.setTipoSangre(rs.getString("tipo_sangre"));
			emp.setRh(rs.getString("rh"));
			emp.setPasaporte(rs.getString("numero_pasaporte"));
			emp.setProgramaAcademico(rs.getString("nombre_programa"));
			emp.setNombreAcudiente(rs.getString("nombre_acudiente"));
			emp.setTelefonoAcudiente(rs.getString("numero_acudiente"));
			emp.setParentescoAcudiente(rs.getString("parentesco_acudiente"));
			return emp;
		}
	}

}
