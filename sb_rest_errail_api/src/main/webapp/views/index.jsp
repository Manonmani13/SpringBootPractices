<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ticket Form</title>
</head>
<body>
    <h1>Create or Update Ticket</h1>
    <form action="bookTicket" method="post">
        <label for="ticketId">Ticket ID:</label><br>
        <input type="number" id="ticketId" name="ticketId"><br><br>

        <label for="from">From:</label><br>
        <input type="text" id="from" name="from"><br><br>

        <label for="to">To:</label><br>
        <input type="text" id="to" name="to"><br><br>

        <label for="trialNum">Train Number:</label><br>
        <input type="text" id="trialNum" name="trialNum"><br><br>

        <label for="tktCost">Ticket Cost:</label><br>
        <input type="text" id="tktCost" name="tktCost"><br><br>

        <label for="ticketStatus">Ticket Status:</label><br>
        <input type="text" id="ticketStatus" name="ticketStatus"><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
