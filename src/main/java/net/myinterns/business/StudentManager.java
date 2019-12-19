package net.myinterns.business;

import java.util.List;

import net.andree.MyInterns.common.dto.StudentDTO;
import net.andree.MyInterns.common.dto.UserDTO;

public interface StudentManager {

	List<StudentDTO> getAll();

	StudentDTO getById(long id);

	void saveOrUpdate(final String name, final String surname, final String description, final String email,
			final UserDTO userDTO);

	void saveOrUpdate(final StudentDTO studentDTO);

	void delete(long id);
}
