# eblibrary

This is the sample library for Ebpearls. 

Step 1: Add it in your root build.gradle at the end of repositories: 
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

Its All done !!

Now you can show the custom alert and toast

// initialize the ebAlert
 private val ebAlert: EbAlert by lazy {
        EbAlert(this@MainActivity)
    }

 // A function to show the EbAlert
    fun showEbAlert(v: View) {
        ebAlert.showAlert(msg = "Hello All")
    }
    
    // A function to show the toast
     fun showToast(v: View) {
        ebAlert.showToast(msg = "Hello All")
    }
