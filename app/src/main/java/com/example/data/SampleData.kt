package com.example.data

import com.example.R
import com.example.model.*

object SampleData {

    val property1 = Property(
        id = "prop_1",
        title = "Premium PG for Boys",
        propertyType = PropertyType.PG,
        location = "Alkapuri, Vadodara, Gujarat",
        city = "Vadodara",
        rent = 6500,
        deposit = 1000,
        images = listOf(
            R.drawable.hero_bedroom_splash,
            R.drawable.prop_apartment_living,
            R.drawable.prop_hostel_bunk,
            R.drawable.prop_villa_exterior
        ),
        rating = 4.7,
        reviewsCount = 358,
        roomsCount = 3,
        occupancy = "Sharing (2/3)",
        foodType = FoodType.BOTH,
        gender = "For Boys",
        amenities = listOf("Wi-Fi", "AC", "Food", "Laundry", "24x7 Security", "Furnished", "Parking", "Study Room"),
        description = "Fully furnished PG for boys with all modern amenities. Clean rooms, home-cooked food, high-speed Wi-Fi, 24x7 security and peaceful environment. Located near MS University, Alkapuri.",
        ownerName = "Rahul Sharma",
        ownerPhone = "+91 98765 43210",
        ownerRole = "Property Owner • Member since Jan 2024",
        isVerified = true,
        noBrokerage = true,
        badgeTag = "Verified",
        viewsCount = 24,
        inquiriesCount = 8,
        bookingsCount = 5,
        status = PropertyStatus.ACTIVE,
        availableFrom = "15 Oct 2026",
        roomOptions = listOf(
            RoomOption("opt_1_1", "Shared Room (2-3 people)", 6500, "Occupancy 2/3"),
            RoomOption("opt_1_2", "Single Room", 9000, "Private room with study desk"),
            RoomOption("opt_1_3", "AC Room", 8000, "Air conditioned twin room")
        )
    )

    val property2 = Property(
        id = "prop_2",
        title = "Student Hostel",
        propertyType = PropertyType.HOSTEL,
        location = "Near MS University, Vadodara",
        city = "Vadodara",
        rent = 4500,
        deposit = 1000,
        images = listOf(
            R.drawable.prop_hostel_bunk,
            R.drawable.hero_bedroom_splash,
            R.drawable.prop_apartment_living
        ),
        rating = 4.6,
        reviewsCount = 254,
        roomsCount = 4,
        occupancy = "Sharing (3/4)",
        foodType = FoodType.VEG_ONLY,
        gender = "For Boys",
        amenities = listOf("Wi-Fi", "AC", "Study Room", "Laundry", "24x7 Security"),
        description = "Budget-friendly student hostel right opposite MS University campus. Includes high-speed Wi-Fi, pure vegetarian meals 3 times a day, 24-hour warden security, and daily housekeeping.",
        ownerName = "Hostel Manager",
        ownerPhone = "+91 98765 43211",
        ownerRole = "Hostel Warden • Member since Mar 2023",
        isVerified = true,
        noBrokerage = true,
        badgeTag = "Verified",
        viewsCount = 42,
        inquiriesCount = 15,
        bookingsCount = 9,
        status = PropertyStatus.ACTIVE,
        availableFrom = "01 Nov 2026",
        roomOptions = listOf(
            RoomOption("opt_2_1", "4-Bed Dormitory", 4500, "Bunk bed with locker"),
            RoomOption("opt_2_2", "Double Sharing", 6000, "Twin room with balcony"),
            RoomOption("opt_2_3", "Single Room", 7500, "Quiet single room")
        )
    )

    val property3 = Property(
        id = "prop_3",
        title = "2 BHK Apartment",
        propertyType = PropertyType.APARTMENT,
        location = "New Alkapuri, Vadodara",
        city = "Vadodara",
        rent = 12000,
        deposit = 24000,
        images = listOf(
            R.drawable.prop_apartment_living,
            R.drawable.hero_bedroom_splash,
            R.drawable.prop_villa_exterior
        ),
        rating = 4.8,
        reviewsCount = 120,
        roomsCount = 2,
        occupancy = "Full Apartment",
        foodType = FoodType.NO_FOOD,
        gender = "Any",
        amenities = listOf("Wi-Fi", "AC", "Parking", "24x7 Security", "Furnished"),
        description = "Spacious modern 2 BHK flat suitable for working professionals or college students sharing. Fully modular kitchen, modular wardrobes, covered car parking, and 24x7 security lift back-up.",
        ownerName = "Rakesh Patel",
        ownerPhone = "+91 98765 43212",
        ownerRole = "Apartment Owner • Member since 2022",
        isVerified = true,
        noBrokerage = true,
        badgeTag = "Verified",
        viewsCount = 36,
        inquiriesCount = 11,
        bookingsCount = 6,
        status = PropertyStatus.ACTIVE,
        availableFrom = "15 Oct 2026",
        roomOptions = listOf(
            RoomOption("opt_3_1", "Full 2 BHK Apartment", 12000, "Entire unit"),
            RoomOption("opt_3_2", "Master Bedroom with Balcony", 7000, "Private attached washroom"),
            RoomOption("opt_3_3", "Standard Bedroom", 5500, "Spacious room")
        )
    )

    val property4 = Property(
        id = "prop_4",
        title = "Single Room (AC)",
        propertyType = PropertyType.ROOM,
        location = "Old Padra Road, Vadodara",
        city = "Vadodara",
        rent = 7000,
        deposit = 2000,
        images = listOf(
            R.drawable.hero_bedroom_splash,
            R.drawable.prop_hostel_bunk
        ),
        rating = 4.5,
        reviewsCount = 98,
        roomsCount = 1,
        occupancy = "Single",
        foodType = FoodType.BOTH,
        gender = "For Boys",
        amenities = listOf("Wi-Fi", "AC", "Attached Washroom", "Furnished", "Food"),
        description = "Comfortable independent private room with attached washroom, smart TV, air conditioning, study desk, and wardrobe. Delicious home-cooked meals included twice a day.",
        ownerName = "Rahul Sharma",
        ownerPhone = "+91 98765 43210",
        ownerRole = "Property Owner • Member since Jan 2024",
        isVerified = true,
        noBrokerage = true,
        badgeTag = "Verified",
        viewsCount = 18,
        inquiriesCount = 3,
        bookingsCount = 1,
        status = PropertyStatus.INACTIVE,
        availableFrom = "Immediately",
        roomOptions = listOf(
            RoomOption("opt_4_1", "Private AC Room", 7000, "Single occupancy with attached bath")
        )
    )

    val property5 = Property(
        id = "prop_5",
        title = "Luxury Villa (For Students)",
        propertyType = PropertyType.VILLA,
        location = "Waghodia Road, Vadodara",
        city = "Vadodara",
        rent = 15000,
        deposit = 30000,
        images = listOf(
            R.drawable.prop_villa_exterior,
            R.drawable.prop_apartment_living,
            R.drawable.hero_bedroom_splash
        ),
        rating = 4.9,
        reviewsCount = 76,
        roomsCount = 5,
        occupancy = "Sharing (2/3)",
        foodType = FoodType.VEG_ONLY,
        gender = "For Boys",
        amenities = listOf("Wi-Fi", "AC", "Parking", "Garden", "24x7 Security", "Furnished"),
        description = "High-end luxury villa exclusively for students. Huge private lawn, gaming lounge, high-speed fiber internet, rooftop terrace, gym area, and all inclusive bills.",
        ownerName = "Vikram Shah",
        ownerPhone = "+91 98765 43215",
        ownerRole = "Villa Owner • Member since Aug 2023",
        isVerified = true,
        noBrokerage = true,
        badgeTag = "Verified",
        viewsCount = 50,
        inquiriesCount = 20,
        bookingsCount = 12,
        status = PropertyStatus.ACTIVE,
        availableFrom = "01 Nov 2026",
        roomOptions = listOf(
            RoomOption("opt_5_1", "Deluxe Twin Sharing", 15000, "Includes all bills & amenities"),
            RoomOption("opt_5_2", "Master Suite Single", 24000, "Private balcony & luxury bath")
        )
    )

    val property6 = Property(
        id = "prop_6",
        ownerId = "owner_001",
        title = "Cozy Room Near MSU",
        propertyType = PropertyType.ROOM,
        location = "Gorva, Vadodara",
        city = "Vadodara",
        rent = 4200,
        deposit = 1000,
        images = listOf(
            R.drawable.hero_bedroom_splash,
            R.drawable.prop_hostel_bunk
        ),
        rating = 4.5,
        reviewsCount = 210,
        roomsCount = 1,
        occupancy = "Single",
        foodType = FoodType.BOTH,
        gender = "For Boys",
        amenities = listOf("Wi-Fi", "Food", "Attached Washroom", "Furnished"),
        description = "Affordable student room 5 mins walking distance from MSU polytechnic. Peaceful study environment with Wi-Fi and morning breakfast.",
        ownerName = "Mahesh Dave",
        ownerPhone = "+91 98765 43216",
        ownerRole = "Owner",
        isVerified = true,
        noBrokerage = true,
        badgeTag = "Popular",
        viewsCount = 30,
        inquiriesCount = 9,
        bookingsCount = 3,
        status = PropertyStatus.ACTIVE,
        availableFrom = "15 Oct 2026"
    )

    val property7 = Property(
        id = "prop_7",
        title = "Girls PG with Food",
        propertyType = PropertyType.PG,
        location = "Subhanpura, Vadodara",
        city = "Vadodara",
        rent = 7000,
        deposit = 1500,
        images = listOf(
            R.drawable.hero_bedroom_splash,
            R.drawable.prop_apartment_living
        ),
        rating = 4.8,
        reviewsCount = 412,
        roomsCount = 2,
        occupancy = "Sharing (2/3)",
        foodType = FoodType.VEG_ONLY,
        gender = "For Girls",
        amenities = listOf("Wi-Fi", "Food", "24x7 Security", "Furnished", "AC"),
        description = "Safe and secure PG for girls with CCTV surveillance, female warden, biometric entry, hygienic meals, and quiet study room.",
        ownerName = "Sunita Ben",
        ownerPhone = "+91 98765 43217",
        ownerRole = "PG In-charge",
        isVerified = true,
        noBrokerage = true,
        badgeTag = "Near University",
        viewsCount = 65,
        inquiriesCount = 22,
        bookingsCount = 14,
        status = PropertyStatus.ACTIVE,
        availableFrom = "Immediately"
    )

    val property8 = Property(
        id = "prop_8",
        title = "Shared Room for Boys",
        propertyType = PropertyType.ROOM,
        location = "Fatehgunj, Vadodara",
        city = "Vadodara",
        rent = 3500,
        deposit = 800,
        images = listOf(
            R.drawable.prop_hostel_bunk,
            R.drawable.hero_bedroom_splash
        ),
        rating = 4.3,
        reviewsCount = 102,
        roomsCount = 1,
        occupancy = "Sharing (3)",
        foodType = FoodType.BOTH,
        gender = "For Boys",
        amenities = listOf("Wi-Fi", "Food", "Furnished", "Near University"),
        description = "Pocket-friendly shared accommodation right in the heart of Fatehgunj food street. Ideal for students on a tight budget.",
        ownerName = "Arjun Patel",
        ownerPhone = "+91 98765 43218",
        ownerRole = "Owner",
        isVerified = true,
        noBrokerage = true,
        badgeTag = "Budget Friendly",
        viewsCount = 19,
        inquiriesCount = 5,
        bookingsCount = 2,
        status = PropertyStatus.ACTIVE,
        availableFrom = "15 Oct 2026"
    )

    val allProperties = listOf(
        property1,
        property2,
        property3,
        property4,
        property5,
        property6,
        property7,
        property8
    )

    val initialBookings = listOf(
        Booking(
            id = "#PR20261015001",
            property = property1,
            selectedRoom = property1.roomOptions[0],
            moveInDate = "15 Oct 2026",
            duration = "6 Months",
            durationMonths = 6,
            additionalRequests = "Near quiet corner room requested.",
            paymentMethod = "Online Payment",
            paymentStatus = "Paid",
            bookingStatus = BookingStatus.CONFIRMED,
            rentAmount = 6500,
            depositAmount = 6500,
            totalAmount = 13000,
            bookingDate = "15 Oct 2026"
        ),
        Booking(
            id = "#PR20261101002",
            property = property2,
            selectedRoom = property2.roomOptions[0],
            moveInDate = "01 Nov 2026",
            duration = "3 Months",
            durationMonths = 3,
            additionalRequests = "Lower bunk preferred.",
            paymentMethod = "Pay at Property (COD)",
            paymentStatus = "Pending",
            bookingStatus = BookingStatus.PENDING,
            rentAmount = 4500,
            depositAmount = 1000,
            totalAmount = 5500,
            bookingDate = "01 Nov 2026"
        ),
        Booking(
            id = "#PR20260910003",
            property = property5,
            selectedRoom = property5.roomOptions[0],
            moveInDate = "10 Sep 2026",
            duration = "1 Month",
            durationMonths = 1,
            additionalRequests = "",
            paymentMethod = "Online Payment",
            paymentStatus = "Refunded",
            bookingStatus = BookingStatus.CANCELLED,
            rentAmount = 15000,
            depositAmount = 15000,
            totalAmount = 30000,
            bookingDate = "10 Sep 2026"
        )
    )

    val initialConversations = listOf(
        Conversation(
            id = "conv_1",
            contactName = "PG Owner (Rakesh)",
            contactSubtitle = "Owner • Premium PG for Boys",
            isVerified = true,
            lastMessage = "Hi, the room is available from 15th Oct. You can visit anytime!",
            timestamp = "10:30 AM",
            unreadCount = 2,
            messages = listOf(
                ChatMessage("m1", "Hello! Is the shared room still available?", true, "10:20 AM"),
                ChatMessage("m2", "Yes, we have 1 seat open in the 2-sharing room.", false, "10:25 AM"),
                ChatMessage("m3", "What are the food timings?", true, "10:28 AM"),
                ChatMessage("m4", "Breakfast: 7:30-9:30 AM, Dinner: 8-10 PM. Clean RO water is 24/7.", false, "10:29 AM"),
                ChatMessage("m5", "Hi, the room is available from 15th Oct. You can visit anytime!", false, "10:30 AM")
            )
        ),
        Conversation(
            id = "conv_2",
            contactName = "Hostel Manager",
            contactSubtitle = "Student Hostel",
            isVerified = true,
            lastMessage = "Sure, you can visit tomorrow between 10 AM to 6 PM.",
            timestamp = "Yesterday",
            unreadCount = 1,
            messages = listOf(
                ChatMessage("m2_1", "Hi, can I come see the student hostel tomorrow?", true, "Yesterday 4:00 PM"),
                ChatMessage("m2_2", "Sure, you can visit tomorrow between 10 AM to 6 PM.", false, "Yesterday 4:15 PM")
            )
        ),
        Conversation(
            id = "conv_3",
            contactName = "Villa Owner",
            contactSubtitle = "Luxury Villa (For Students)",
            isVerified = true,
            lastMessage = "Thanks for your interest! Let me know if you need pictures of the garden.",
            timestamp = "12 Oct",
            unreadCount = 0,
            messages = listOf(
                ChatMessage("m3_1", "Does the villa rent include electricity and Wi-Fi?", true, "12 Oct"),
                ChatMessage("m3_2", "Yes, 100% all inclusive! Thanks for your interest! Let me know if you need pictures of the garden.", false, "12 Oct")
            )
        ),
        Conversation(
            id = "conv_4",
            contactName = "Support Team",
            contactSubtitle = "Purple Rooms 24/7 Help",
            isVerified = true,
            lastMessage = "How can we help you today with your booking or query?",
            timestamp = "10 Oct",
            unreadCount = 0,
            messages = listOf(
                ChatMessage("m4_1", "Welcome to Purple Rooms! How can we help you today with your booking or query?", false, "10 Oct")
            )
        )
    )
}
