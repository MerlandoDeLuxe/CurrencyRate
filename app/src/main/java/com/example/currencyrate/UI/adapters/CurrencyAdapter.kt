package com.example.currencyrate.UI.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.currencyrate.R


abstract class CurrencyAdapter : RecyclerView.Adapter<CurrencyAdapter.CurrencyViewHolder>() {

    class CurrencyViewHolder(itemView: View) : ViewHolder(itemView) {
        val textViewCurrencyName =
            itemView.findViewById<TextView>(R.id.textViewCurrencyName)
        val textViewCyrrencyCharCodeAndCountryName =
            itemView.findViewById<TextView>(R.id.textViewCyrrencyCharCodeAndCountryName)
        val textViewCurrencyToRUB =
            itemView.findViewById<TextView>(R.id.textViewCurrencyToRUB)
        val textViewRUBToCurrency =
            itemView.findViewById<TextView>(R.id.textViewRUBToCurrency)
    }

//    var listOfCurrencies: ArrayList<Valute> = arrayListOf()
//        set(value) {
//            field = value
//            notifyDataSetChanged()
//        }

//    private var onItemClickListenerInterface: OnItemClickListener? = null
//
//    fun onItemClickListener(onItemClickListener: OnItemClickListener) {
//        onItemClickListenerInterface = onItemClickListener
//    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.currency_template, parent, false)
        return CurrencyViewHolder(view)
    }

    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
//        val valute = listOfCurrencies.get(position)
//        holder.textViewCurrencyName.text = valute.charCode
//        holder.textViewCyrrencyCharCodeAndCountryName.text = valute.charCode
//        holder.textViewCurrencyToRUB.text = valute.charCode
//        holder.textViewRUBToCurrency.text = valute.charCode
//
//        holder.itemView.setOnClickListener {
//            onItemClickListenerInterface?.onItemClickListener(valute)
//        }
    }

//    fun interface OnItemClickListener {
//        fun onItemClickListener(valute: Valute)
//    }
//
//    override fun getItemCount(): Int {
//        return listOfCurrencies.size
//    }
}