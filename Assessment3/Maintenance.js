document.getElementById('acServiceForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission

    const customerName = document.getElementById('customerName').value;
    const acType = document.getElementById('acType').value;
    const serviceType = document.getElementById('serviceType').value;
    const email = document.getElementById('email').value;
    const yearlyMaintenance = document.getElementById('yearlyMaintenance').checked;

    let serviceCharge = 0;
    switch (serviceType) {
        case 'Cleaning':
            serviceCharge = 500;
            break;
        case 'Repair':
            serviceCharge = 1000;
            break;
        case 'Gas Refill':
            serviceCharge = 1500;
            break;
    }


    if (yearlyMaintenance) {
        serviceCharge += 1000;
    }
    const maintenanceText = yearlyMaintenance ? "with yearly maintenance" : "without yearly maintenance";
    document.getElementById('result').innerHTML = `Hello ${customerName}, your service appointment for ${acType} AC ${serviceType} ${maintenanceText} will be sent to your email ID ${email} and the estimated service charge will be Rs ${serviceCharge}.`;
});