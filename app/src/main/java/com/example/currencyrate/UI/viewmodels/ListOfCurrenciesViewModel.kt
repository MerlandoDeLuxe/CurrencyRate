package com.example.currencyrate.UI.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers

class ListOfCurrenciesViewModel(application: Application) : AndroidViewModel(application) {
    private val TAG = "ListOfCurrenciesViewModel"
    private val compositeDisposable: CompositeDisposable = CompositeDisposable()
//    private val connectToDatabase = ValuteDatabase.getInstance(application)

//    fun addNewValuteToFavorite(valute: Valute) {
//        val disposable =
//            connectToDatabase?.favoriteCurrenciesDAO?.addNewValuteToFavorite(valute)
//                ?.subscribeOn(Schedulers.io())
//                ?.observeOn(AndroidSchedulers.mainThread())
//                ?.subscribe({ Log.d(TAG, "addNewValuteToFavorite: Успешная вставка в таблицу: valute = $valute") },
//                    { Log.d(TAG, "addAllCurrenciesToDatabase: Ошибка вставки: ${it.message}") })
//        if (disposable != null) {
//            compositeDisposable.add(disposable)
//        }
//    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}