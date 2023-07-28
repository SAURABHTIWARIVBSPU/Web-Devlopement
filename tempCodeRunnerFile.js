// Prompt the user to enter the year
var year = prompt("Enter the year:");

// Create a new Date object with the provided year
var date = new Date(year, 0, 1);

// Get the current year
var currentYear = date.getFullYear();

// Display the calendar header
console.log("Calendar for " + currentYear);

// Display the calendar months
for (var month = 0; month < 12; month++) {
  // Set the month and year for the current iteration
  date.setMonth(month);

  // Get the name of the current month
  var monthName = date.toLocaleString('default', { month: 'long' });

  // Display the month name
  console.log("\n" + monthName);

  // Get the number of days in the current month
  var numDays = new Date(date.getFullYear(), date.getMonth() + 1, 0).getDate();

  // Display the days of the month
  for (var day = 1; day <= numDays; day++) {
    // Set the day for the current iteration
    date.setDate(day);

    // Get the day of the week (0-6, where 0 is Sunday)
    var dayOfWeek = date.getDay();

    // Display the day
    console.log(day + " " + getDayOfWeekName(dayOfWeek));
  }
}

// Function to get the name of the day of the week
function getDayOfWeekName(dayOfWeek) {
  var daysOfWeek = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
  return daysOfWeek[dayOfWeek];
}
