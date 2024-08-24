package com.example.currencyrate.UI.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.currencyrate.UI.API.ApiFactory
import com.example.currencyrate.UI.API.CoinPriceInfo
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import org.json.JSONObject
import org.json.JSONTokener

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val TAG = "MainViewModel"
    private val compositeDisposable: CompositeDisposable = CompositeDisposable()
//    val listOfCurrenciesLD: MutableLiveData<ArrayList<Valute>> = MutableLiveData()
    // val listOfFavoriteCurrenciesLD: MutableLiveData<ArrayList<Valute>> = MutableLiveData()

    private val connectToApi = ApiFactory.getInstance()
    //   private val connectToDatabase = ValuteDatabase.getInstance(application)

//    fun getAllCurrencies() {
//        Log.d(TAG, "getAllCurrencies: connect = $connectToApi")
//        val disposable = connectToApi?.getAllCurrencies("1", "RUB")
//            ?.observeOn(AndroidSchedulers.mainThread())
//            ?.subscribeOn(Schedulers.io())
//            ?.subscribe({
//                Log.d(TAG, "getAllCurrencies: it = $it")
//                getPriceSymbolToSymbol()
//            }, {
//                Log.d(TAG, "getAllCurrencies: Ошибка: ${it.message}")
//            })
//        if (disposable != null) {
//            compositeDisposable.add(disposable)
//        }
//    }

//    fun getPriceSymbolToSymbol() {
//        val disposable = connectToApi?.getPriceSymbolToSymbol("USD", "RUB")
//            ?.subscribeOn(Schedulers.io())
//            ?.observeOn(AndroidSchedulers.mainThread())
//            ?.subscribe({
//                Log.d(TAG, "getPriceSymbolToSymbol: it = ${it.coinPrice}")
//            }, {
//                Log.d(TAG, "getPriceSymbolToSymbol: ошибка: ${it.message}")
//            })
//        if (disposable != null) {
//            compositeDisposable.add(disposable)
//        }
//    }
//    fun selectFromValute() {
//        val list: LiveData<List<Valute>>? = connectToDatabase?.valuteDAO?.selectFromValute()
//        Log.d(TAG, "selectFromValute: ${list?.value}")
//    }

//    fun addAllCurrenciesToDatabase(currenciesList: ArrayList<Valute>) {
//        Log.d(TAG, "addAllCurrenciesToDatabase: connectToDatabase = $connectToDatabase")
//        for (i in 0..currenciesList.size - 1) {
//            val valute = currenciesList.get(i)
//            val disposable = connectToDatabase?.valuteDAO?.addAllCurrenciesToDatabase(valute)
//                ?.subscribeOn(Schedulers.io())
//                ?.observeOn(AndroidSchedulers.mainThread())
//                ?.subscribe({
//                    //Log.d(TAG, "addAllCurrenciesToDatabase: Успешная вставка в таблицу")
//                }, {
//                    Log.d(TAG, "addAllCurrenciesToDatabase: Ошибка вставки: ${it.message}")
//                })
//            if (disposable != null) {
//                compositeDisposable.add(disposable)
//            }
//        }
//    }
//
//    fun getFavoriteCurrencies(): LiveData<List<Valute>>? {
//        return connectToDatabase?.favoriteCurrenciesDAO?.getFavoriteCurrencies()
//    }
//
//    fun removeFavoriteCurrency(valute: Valute) {
//        val disposable = connectToDatabase?.favoriteCurrenciesDAO?.removeFavoriteCurrency(valute)
//            ?.subscribeOn(Schedulers.io())
//            ?.observeOn(AndroidSchedulers.mainThread())
//            ?.subscribe({
//                Log.d(TAG, "removeFavoriteCurrency: удаление успешно")
//            }, {
//                Log.d(TAG, "removeFavoriteCurrency: ошибка удаления записи: ${it.message}")
//            })
//        if (disposable != null) {
//            compositeDisposable.add(disposable)
//        }
//    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}