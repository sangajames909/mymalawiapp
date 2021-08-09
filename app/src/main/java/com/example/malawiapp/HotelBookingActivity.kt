package com.example.malawiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_hotelbooking.*

class HotelBookingActivity : AppCompatActivity() {
    var username: String = ""
    var userhotel: String = ""
    var userRoom: String = ""
    var useremail: String = ""
    var userdate: String = ""

    private var databaseRef: DatabaseReference? = null
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotelbooking)
        databaseRef = FirebaseDatabase.getInstance().getReference("HotelTable")

        btnSubmit.setOnClickListener {
            captureInput()
        }
    }

    private fun captureInput() {
        username = name.text.toString()
        userhotel = hotelname.text.toString()
        userRoom = roomHotel.text.toString()
        useremail = userEmail.text.toString()
        userdate = number.text.toString()


        if (username.isEmpty() && userhotel.isEmpty() && userRoom.isEmpty() && useremail.isEmpty() && userdate.isEmpty()){
            Toast.makeText(applicationContext,"Fields cant be empty", Toast.LENGTH_LONG).show()
        }else{
            submitToFirebase(username,userhotel,userRoom,useremail,userdate,)
            Log.d("test","details are " + username + userhotel + userRoom + useremail + userdate)

        }
    }

    private fun submitToFirebase(username: String, userhotel: String, userRoom: String, useremail: String, userdate: String) {
        val hotelid = databaseRef?.push()?.key //generate
        Log.d("test","testing " + hotelid)
        val hotelUpload = hotelid.let{
            HotelModel(hotelid.toString(),username,userhotel,userRoom,useremail,userdate)
        }
        Log.d("testing","model has " + hotelUpload)
        if (hotelid != null){
            databaseRef?.child(hotelid)?.setValue(hotelUpload)
                    ?.addOnCompleteListener {
                        Toast.makeText(applicationContext,"Booked successfully",Toast.LENGTH_LONG).show()
                    }?.addOnFailureListener {
                        Toast.makeText(applicationContext,"Error check internet connections",Toast.LENGTH_LONG).show()
                    }
        }
    }

}