package com.example.currencyrate.UI

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.currencyrate.UI.viewmodels.MainViewModel
import com.example.currencyrate.R
import com.example.currencyrate.UI.adapters.CurrencyAdapter

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    private lateinit var imageViewAddNewCurrency: ImageView
    private lateinit var imageViewGetNewRates: ImageView
    private lateinit var viewModel: MainViewModel
//    private lateinit var recycleView: RecyclerView
//    private lateinit var adapter: CurrencyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initializeAllElements()
    //    setupOnClickListeners()
        observeViewModel()

        val itemTouchHelperCallback = object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT)
        {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                TODO("Not yet implemented")
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.layoutPosition
//                val task = adapter.listOfCurrencies.get(position)
//                viewModel.removeFavoriteCurrency(task)
            }
        }
        val itemTouchHelper = ItemTouchHelper(itemTouchHelperCallback)
//        itemTouchHelper.attachToRecyclerView(recycleView)
    }

    fun observeViewModel() {
        viewModel.getAllCurrencies()
//        viewModel.listOfCurrenciesLD.observe(this, {
//            listOfCurrencies = it
//        })

        //================================================================
        //Запрос данных избранных валют из БД
//        viewModel.listOfFavoriteCurrenciesLD.observe(this, {
//            adapter.listOfCurrencies = it
//        })
//    viewModel.getFavoriteCurrencies()?.observe(this,{
//        Log.d(TAG, "observeViewModel: it = $it")
//        val tempList: ArrayList<Valute> = arrayListOf()
//        for (i in 0..it.size-1){
//            tempList.add(it.get(i))
//        }
//        adapter.listOfCurrencies = tempList
//
//    })

    }

//    fun setupOnClickListeners() {
//        imageViewAddNewCurrency.setOnClickListener {
//            val intent = ListOfCurrenciesActivity().getInstance(this, listOfCurrencies)
//            startActivity(intent)
//        }
//        //================================================================
//        //Запрос новых курсов валют
//        imageViewGetNewRates.setOnClickListener {
//
//        }
//
//    }

    fun initializeAllElements() {
        imageViewAddNewCurrency = findViewById(R.id.imageViewAddNewCurrency)
        imageViewGetNewRates = findViewById(R.id.imageViewGetNewRates)
//        adapter = CurrencyAdapter()
//        recycleView = findViewById(R.id.recycleView)
//        recycleView.adapter = adapter
//        recycleView.layoutManager = GridLayoutManager(this, 1)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

    }
}