# ExtendedExercise2-03Part2

Partner's Code:

ontactform.html



<body>
<form action="#" th:="@{/contactform}" th:object="${contact}" method="post">

First Name: <input ="text" th:="*{firstName}" /><br />
Last Name: <input ="text" th:="*{lastName}" /><br />
Email Address: <input ="text" th:="*{emailAddress}" /><br />
Phone Number: <input ="number" th:="*{phoneNumber}" /><br />
Address: <input ="text" th:="*{address}" /><br />
City: <input ="text" th:="*{city}" /><br />
State: <input ="text" th:="*{state}" /><br />
Zipcode: <input ="number" th:="*{zipcode}" /><br />
<input ="submit" value="Submit" />

</form>


</body>


confirmcontact.html


<body>

<p th:inline="text">Contact First Name:[[${contact.firstName}]].<br />

Contact Last Name :[[${contact.lastName}]].<br />
Contact Email: [[${contact.emailAddress}]].<br />
Contact Phone Number: [[${contact.phoneNumber}]].<br />
Address: [[${contact.address}]].<br />
Contact City: [[${contact.city}]].<br />
Contact State: [[${contact.state}]].<br />
Contact Phone Number: [[${contact.phoneNumber}]].<br />
Contact Zipcode: [[${contact.zipcode}]].<br />

</p>

 

</body>
