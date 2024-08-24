package com.example.currencyrate.UI

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.currencyrate.UI.adapters.CurrencyAdapter
import com.example.currencyrate.UI.viewmodels.ListOfCurrenciesViewModel
import com.example.currencyrate.R

class ListOfCurrenciesActivity : AppCompatActivity() {
    private val TAG = "ListOfCurrenciesActivity"
    private val EXTRA_LISTOFCURRENCIES = "listOfCurrencies"
    private val EXTRA_BUNDLE = "bundle"
    private lateinit var imageViewBackToMainActivity: ImageView
//    private lateinit var adapter: CurrencyAdapter
//    private lateinit var recycleView: RecyclerView
    private lateinit var viewModel: ListOfCurrenciesViewModel

    private var bundleArgs: Bundle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_of_currencies)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        bundleArgs = intent.getBundleExtra(EXTRA_BUNDLE)
//        listOfCurrencies = bundleArgs?.getSerializable(EXTRA_LISTOFCURRENCIES) as ArrayList<Valute>
        initializeAllElements()
//        setupOnClickListeners()
        ovserveViewModel()

//        adapter.listOfCurrencies = listOfCurrencies
    }

    private fun ovserveViewModel() {

    }

//    private fun setupOnClickListeners() {
//        imageViewBackToMainActivity.setOnClickListener { finish() }
//        adapter.onItemClickListener {
//            listOfSelectedCurrencies.add(it)
//            Log.d(
//                TAG,
//                "setupOnClickListeners: listOfSelectedCurrencies = $listOfSelectedCurrencies"
//            )
//            viewModel.addNewValuteToFavorite(it)
//            finish()
//        }
//    }

//    fun getInstance(context: Context, listOfCurrencies: ArrayList<Valute>): Intent {
//        val intent = Intent(context, ListOfCurrenciesActivity::class.java)
//        val bundleArgs = Bundle()
//        bundleArgs.putSerializable(EXTRA_LISTOFCURRENCIES, listOfCurrencies)
//        intent.putExtra(EXTRA_BUNDLE, bundleArgs)
//        return intent
//    }

    private fun initializeAllElements() {
        imageViewBackToMainActivity = findViewById(R.id.imageViewBackToMainActivity)
//        adapter = CurrencyAdapter()
//        recycleView = findViewById(R.id.recycleView)
//        recycleView.adapter = adapter
//        recycleView.layoutManager = GridLayoutManager(this, 1)
        viewModel = ViewModelProvider(this).get(ListOfCurrenciesViewModel::class.java)
    }
}