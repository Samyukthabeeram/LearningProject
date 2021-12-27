package com.java.beginner3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();

		String[] branches = { "CSE", "ECE", "EEE", "MEC" };
		String[] names = { "krishna", "chaitanya", "doma", "samyuktha", "paul", "bobby", "rahul", "kumar", "apoorva",
				"suresh" };
		for (int j = 0; j < branches.length; j++) {
			for (int i = 0; i < 3; i++) {
				for (int k = 0; k < 10; k++) {
					Student student = new Student();
					// YEAR+BRANCH_CODE+SEM+ROLL_NUM
					// 21CSE100
					Calendar calendar = Calendar.getInstance();
					int sem = i + 1;
					String id = calendar.get(Calendar.YEAR) + branches[j] + (sem) + "0" + (k + 1);
					id = id.substring(2);
					student.setId(id);
					student.setFirstName(names[k]);
					student.setMiddleName("middleName");
					student.setLastName("lastName-" + k);

					calendar.set(2021, i, 31, 0, 0, 0);
					student.setDateOfJoining(calendar.getTime());

					calendar.set(1988, i, sem, 0, 0, 0);
					student.setDateOfBirth(calendar.getTime());

					student.setSemester(sem);
					student.setBranch(branches[j]);

					Address permanentAddress = new Address();
					permanentAddress.setDistrict("Karimnagar");
					permanentAddress.setDoorNum(201);
					permanentAddress.setHouseNum("2-2-22");
					permanentAddress.setPin(500051);
					permanentAddress.setState("Telangana");
					permanentAddress.setStreet("boiwada");
					student.setPermanentAddress(permanentAddress);

					student.setContactAndPermanentSame(true);

					Contact personalContact = new Contact();
					personalContact.setCall(9703685568l);
					personalContact.setEmail("email@email.com");
					personalContact.setMessengerSameAsCall(true);
					student.setPersonalContact(personalContact);

					Contact gaurdianContact = new Contact();
					gaurdianContact.setCall(9398253395l);
					gaurdianContact.setEmail("gaurdian@email.com");
					gaurdianContact.setMessengerSameAsCall(true);
					student.setGaurdianContact(personalContact);

					students.add(student);
				}
			}

		}

		Collections.sort(students, new StudentComparator(args[0], args[1]));

		for (int i = 0; i < students.size(); i++) {

			Student student = students.get(i);

			System.out.print(student.getFirstName() + " ");
			System.out.print(student.getMiddleName() + " ");
			System.out.print(student.getLastName() + "\t");
			System.out.print(student.getId() + "\t");
			System.out.print(student.getBranch() + "\t");
			System.out.print(student.getSemester() + "\t");
			System.out.print("h-no: " + student.getPermanentAddress().getHouseNum() + ", ");
			System.out.print("d-no: " + student.getPermanentAddress().getDoorNum() + ", ");
			System.out.print(student.getPermanentAddress().getStreet() + ", ");
			System.out.print(student.getPermanentAddress().getDistrict() + ", ");
			System.out.print(student.getPermanentAddress().getState() + ", ");
			System.out.print(student.getPermanentAddress().getPin() + "\t");
			if (student.isContactAndPermanentSame()) {
				System.out.print("contact address same as permanent address \t");
			} else {
				System.out.print("h-no: " + student.getContactAddress().getHouseNum() + ", ");
				System.out.print("d-no: " + student.getContactAddress().getDoorNum() + ", ");
				System.out.print(student.getContactAddress().getStreet() + ", ");
				System.out.print(student.getContactAddress().getDistrict() + ", ");
				System.out.print(student.getContactAddress().getState() + ", ");
				System.out.print(student.getContactAddress().getPin() + "\t");
			}

			System.out.print(student.getPersonalContact().getCall() + "\t");
			if (student.getPersonalContact().getTelephone() > 0) {
				System.out.print(student.getPersonalContact().getTelephone() + "\t");
			} else {
				System.out.print("no telephone \t");
			}
			if (student.getPersonalContact().isMessengerSameAsCall()) {
				System.out.print("Messenger is same as call number \t");
			} else {
				System.out.print(student.getPersonalContact().getMessenger());
			}
			System.out.print(student.getPersonalContact().getEmail() + "\t");

			System.out.print(student.getGaurdianContact().getCall() + "\t");
			if (student.getGaurdianContact().getTelephone() != 0) {
				System.out.print(student.getGaurdianContact().getTelephone() + "\t");
			} else {
				System.out.print("no telephone \t");
			}
			if (student.getGaurdianContact().isMessengerSameAsCall()) {
				System.out.print("Messenger is same as call number \t");
			} else {
				System.out.print(student.getGaurdianContact().getMessenger() + "\t");
			}
			System.out.println(student.getGaurdianContact().getEmail());
		}
	}

}
