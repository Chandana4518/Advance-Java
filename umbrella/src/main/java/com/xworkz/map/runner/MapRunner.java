package com.xworkz.map.runner;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.Filter;

import com.xworkz.map.dto.PassportDTO;
import com.xworkz.map.dto.PassportDTOType;
import com.xworkz.map.dto.PersonDTO;

public class MapRunner {

	public static void main(String[] args) {

		Map<Long, String> map = new HashMap<Long, String>();

		map.put(9390792007L, "Chandana");
		map.put(1234567890L, "Alice");
		map.put(2345678901L, "Rohit Sharma");
		map.put(3456789012L, "Charlie");
		map.put(4567890123L, "David");
		map.put(5678901234L, "Shubman Gill");
		map.put(6789012345L, "Frank");
		map.put(7890123456L, "Grace");
		map.put(8901234567L, "Hannah");
		map.put(9012345678L, "Virat Kohli");
		map.put(9876543210L, "John");
		map.put(9875543210L, "Olivia");
		map.put(8765432109L, "William");
		map.put(7654321098L, "Sophia");
		map.put(6543210987L, "James");
		map.put(5432109876L, "Adithya");
		map.put(4321098765L, "Daniel");
		map.put(3210987654L, "Ishan Kishan");
		map.put(2109876543L, "Henry");
		map.put(1098765432L, "Linda");
		System.out.println("*** Collect names with characters more than 10 ***");
		Set<String> names = map.values().stream().filter(e -> e.length() > 10).collect(Collectors.toSet());
		names.forEach(System.out::println);
		System.out.println("*** Collect names with characters less than 10 ***");
		Set<String> names1 = map.values().stream().filter(e -> e.length() < 10).collect(Collectors.toSet());
		names1.forEach(System.out::println);
		System.out.println("*** Collect all names in Uppercase ***");
		Set<String> uppercaseNames = map.values().stream().map(e -> e.toUpperCase()).collect(Collectors.toSet());
		uppercaseNames.forEach(System.out::println);
		System.out.println("*** Collect all mobile numbers ending with 0 ***");
		Set<Long> numberEndsWith = map.keySet().stream().filter(e -> e.toString().endsWith("0"))
				.collect(Collectors.toSet());
		numberEndsWith.forEach(System.out::println);
		System.out.println("*** Collect all mobile numbers Starting with 0 ***");
		Set<Long> numberStartsWith = map.keySet().stream().filter(e -> e.toString().startsWith("8"))
				.collect(Collectors.toSet());
		numberStartsWith.forEach(System.out::println);

		Map<PersonDTO, PassportDTO> persons = new HashMap<PersonDTO, PassportDTO>();

		PersonDTO personDTO = new PersonDTO(1, "Chandana", "chandana123@Gmail.com", 9390792007L);
		PersonDTO personDTO2 = new PersonDTO(2, "John", "john@example.com", 9876543210L);
		PersonDTO personDTO3 = new PersonDTO(3, "Alice", "alice@example.com", 1234567890L);
		PersonDTO personDTO4 = new PersonDTO(4, "Bob", "bob@example.com", 2345678901L);
		PersonDTO personDTO5 = new PersonDTO(5, "Charlie", "charlie@example.com", 3456789012L);
		PersonDTO personDTO6 = new PersonDTO(6, "David", "david@example.com", 4567890123L);
		PersonDTO personDTO7 = new PersonDTO(7, "Eva", "eva@example.com", 5678901234L);
		PersonDTO personDTO8 = new PersonDTO(8, "Frank", "frank@example.com", 6789012345L);
		PersonDTO personDTO9 = new PersonDTO(9, "Grace", "grace@example.com", 7890123456L);
		PersonDTO personDTO10 = new PersonDTO(10, "Hannah", "hannah@example.com", 8901234567L);

		PassportDTO passportDTO = new PassportDTO(1, "A1234567", LocalDate.of(2004, 12, 1), "Government",
				LocalDate.of(2011, 11, 10), PassportDTOType.BIOMETRIC_PASSPORT);
		PassportDTO passportDTO2 = new PassportDTO(2, "B9876543", LocalDate.of(2005, 5, 15), "Government",
				LocalDate.of(2022, 8, 20), PassportDTOType.TRAVEL_PASSPORT);
		PassportDTO passportDTO3 = new PassportDTO(3, "C5678901", LocalDate.of(2006, 7, 3), "Embassy",
				LocalDate.of(2029, 3, 5), PassportDTOType.EMERGENCY_PASSPORT);
		PassportDTO passportDTO4 = new PassportDTO(4, "D2345678", LocalDate.of(2007, 10, 21), "Government",
				LocalDate.of(2024, 6, 30), PassportDTOType.BIOMETRIC_PASSPORT);
		PassportDTO passportDTO5 = new PassportDTO(5, "E8765432", LocalDate.of(2008, 2, 9), "Government",
				LocalDate.of(2025, 2, 14), PassportDTOType.OFFICIAL_PASSPORT);
		PassportDTO passportDTO6 = new PassportDTO(6, "F3456789", LocalDate.of(2029, 8, 14), "Consulate",
				LocalDate.of(2026, 9, 22), PassportDTOType.TRAVEL_PASSPORT);
		PassportDTO passportDTO7 = new PassportDTO(7, "G7890123", LocalDate.of(2010, 4, 5), "Government",
				LocalDate.of(2027, 5, 7), PassportDTOType.FAMILY_PASSPORT);
		PassportDTO passportDTO8 = new PassportDTO(8, "H2109876", LocalDate.of(2024, 6, 17), "Embassy",
				LocalDate.of(2028, 4, 18), PassportDTOType.BIOMETRIC_PASSPORT);
		PassportDTO passportDTO9 = new PassportDTO(9, "I5432109", LocalDate.of(2012, 9, 30), "Government",
				LocalDate.of(2029, 3, 29), PassportDTOType.SERVICE_PASSPORT);
		PassportDTO passportDTO10 = new PassportDTO(10, "J1098765", LocalDate.of(2025, 3, 11), "Government",
				LocalDate.of(2030, 7, 11), PassportDTOType.OFFICIAL_PASSPORT);

		persons.put(personDTO, passportDTO);
		persons.put(personDTO2, passportDTO2);
		persons.put(personDTO3, passportDTO3);
		persons.put(personDTO4, passportDTO4);
		persons.put(personDTO5, passportDTO5);
		persons.put(personDTO6, passportDTO6);
		persons.put(personDTO7, passportDTO7);
		persons.put(personDTO8, passportDTO8);
		persons.put(personDTO9, passportDTO9);
		persons.put(personDTO10, passportDTO10);
		
		System.out.println("*** Collect all PersonDTO ***");
		Set<PersonDTO> dto = persons.keySet().stream().collect(Collectors.toSet());
		dto.forEach(System.out::println);
		
		System.out.println("*** Collect all PassportDTO ***");
		Set<PassportDTO> passportDto = persons.values().stream().collect(Collectors.toSet());
		passportDto.forEach(System.out::println);
		
		System.out.println("*** Collect all passport by type ***");
		Set<PassportDTO> type = persons.values().stream()
				.filter(e -> e.getType().equals(PassportDTOType.EMERGENCY_PASSPORT)).collect(Collectors.toSet());
		type.forEach(System.out::println);
		
		System.out.println("*** Collect all Passport by issuedDate is less than today's date  and expired date***");
		Set<PassportDTO> issuedDate = persons.values().stream().filter(e -> e.getIssuedDate().isBefore(LocalDate.now())&& e.getExpiryDate().isBefore(LocalDate.now()))
				.collect(Collectors.toSet());
		issuedDate.forEach(System.out::println);
		
		System.out.println("*** Collect all expired Passport ***");
		Set<PassportDTO> expiredDate = persons.values().stream()
				.filter(e -> e.getExpiryDate().isBefore(LocalDate.now())).collect(Collectors.toSet());
		expiredDate.forEach(System.out::println);

		System.out.println("*** Get passport by number ***");
		Optional<PassportDTO> opt = persons.values().stream().filter(e -> e.getNo().equals("G7890123")).findFirst();
		if (opt.isPresent()) {
			System.out.println(opt.get());
		}
		
		System.out.println("*** Get person by name ***");
		Optional<PersonDTO> optional = persons.keySet().stream().filter(e -> e.getName().equals("Grace")).findFirst();
		if (optional.isPresent()) {
			System.out.println(optional.get());
		}
	}

}
