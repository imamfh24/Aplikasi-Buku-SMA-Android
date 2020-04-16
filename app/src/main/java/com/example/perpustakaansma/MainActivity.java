package com.example.perpustakaansma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Buku> buku1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataBuku();
        RecyclerView myrv = (RecyclerView) findViewById(R.id.rv_id);
        ListBukuAdapter listBukuAdapter = new ListBukuAdapter(this,buku1);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(listBukuAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        int positionOfMenuItem = 0;
        MenuItem item = menu.getItem(positionOfMenuItem);
        SpannableString s = new SpannableString("Imam FH");
        s.setSpan(new ForegroundColorSpan(Color.WHITE), 0, s.length(), 0);
        item.setTitle(s);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int itemId){
        switch (itemId){
            case R.id.ikonsaya:
                showAbout();
        }
    }

    public void showAbout (){
        Intent intent = new Intent(MainActivity.this,AboutActivity.class);
        startActivity(intent);
    }

    public void dataBuku(){
        String fis = "Sekarang ini, ilmu dan teknologi berkembang dengan pesat. Seiring dengan perkembangan tersebut, Fisika sebagai bagian dari ilmu dan teknologi ikut berkembang pula, baik itu teori maupun penerapannya. Fisika adalah ilmu dasar teknologi. Fakta-fakta kehidupan, seperti gerak, cahaya, optik, kalor, dan materi lain yang sehari-hari digunakan manusia dipelajari dalam Fisika.\n" +
                "\n" +
                "Oleh karena itu, perlu adanya peningkatan kualitas pendidikan Fisika di sekolah agar membentuk manusia yang memiliki daya nalar dan daya pikir yang baik, kreatif, cerdas dalam memecahkan masalah, serta mampu mengomunikasikan gagasan-gagasannya. Pendidikan Fisika harus dapat membantu Anda me- nyongsong masa depan dengan lebih baik. Atas dasar inilah, kami menerbitkan buku Praktis Belajar Fisika ini kehadapan Anda, khususnya para siswa Sekolah Menengah Atas. \n" +
                "\n" +
                "Buku ini menghadirkan aspek kontekstual bagi Anda dengan mengutamakan pemecahan masalah sebagai bagian dari pembelajaran untuk memberikan kesempatan kepada Anda membangun pengetahuan dan mengembangkan potensi diri.";
        String bio = "Biologi merupakan ilmu yang sangat berkaitan dengan kehidupan. Makhluk hidup yang mencakup manusia, hewan, tumbuhan, dan mikroorganisme beserta lingkungannya dipelajari dalam Biologi. Dengan mempelajari Biologi, Anda dapat memahami fakta-fakta kehidupan di lingkungan sekitar.\n" +
                "\n" +
                "Melihat betapa pentingnya Biologi maka perlu adanya peningkatan kualitas pendidikan Biologi di sekolah agar membentuk siswa yang memiliki daya nalar dan daya pikir yang baik, kreatif, cerdas dalam memecahkan masalah, serta mampu mengomunikasikan gagasan-gagasannya. Buku ini menghadirkan aspek kontekstual bagi siswa dengan mengutamakan pemecahan masalah sebagai bagian dari pembelajaran untuk memberikan kesempatan kepada siswa membangun pengetahuan dan mengembangkan potensi mereka sendiri.\n" +
                "\n" +
                "Materi dalam buku ini diharapkan dapat membawa Anda untuk memperoleh pemahaman tentang ilmu Biologi sebagai proses dan produk. Materi pelajaran Biologi yang disajikan bertujuan membekali Anda dengan pengetahuan, pemahaman, dan sejumlah kemampuan untuk memasuki jenjang yang lebih tinggi, serta mengembangkan ilmu Biologi dalam kehidupan sehari-hari.";
        String kim = "Kimia merupakan ilmu kehidupan. Fakta-fakta kehidupan, seperti tumbuhan, manusia, udara, makanan, minuman, dan materi lain yang sehari-hari digunakan manusia dipelajari dalam Kimia. Kimia sangat erat kaitannya dengan kehidupan.\n" +
                "\n" +
                "Oleh karena itu, perlu adanya peningkatan kualitas pendidikan Kimia di sekolah agar membentuk siswa yang memiliki daya nalar dan daya pikir yang baik, kreatif, cerdas dalam memecahkan masalah, serta mampu mengomunikasikan gagasan-gagasannya. Buku ini menghadirkan aspek kontekstual bagi siswa dengan mengutamakan pemecahan masalah sebagai bagian dari pembelajaran untuk memberikan kesempatan kepada siswa membangun pengetahuan dan mengembangkan potensi mereka sendiri.\n" +
                "\n" +
                "Materi dalam buku ini diharapkan dapat membawa Anda untuk memperoleh pemahaman tentang ilmu Kimia sebagai proses dan produk. Materi pelajaran Kimia yang disajikan bertujuan membekali Anda dengan pengetahuan, pemahaman, dan sejumlah kemampuan untuk memasuki jenjang yang lebih tinggi, serta mengembangkan ilmu Kimia dalam kehidupan sehari-hari.";
        String mtk = "Matematika adalah hasil abstraksi (pemikiran) manusia terhadap objek-objek di sekitar kita dan menyelesaikan masalah yang terjadi dalam kehidupan, sehingga dalam mempelajarinya kamu harus memikirkannya kembali, bagaimana pemikiran para penciptanya terdahulu. Belajar matematika sangat berguna bagi kehidupan. Cobalah membaca dan pahami materinya serta terapkan untuk menyelesaikan masalah-masalah kehidupan di lingkunganmu. Kamu punya kemampuan, kami yakin kamu pasti bisa melakukannya.\n" +
                "\n" +
                "Buku ini diawali dengan pengajuan masalah yang bersumber dari fakta dan lingkungan budaya siswa terkait dengan materi yang akan diajarkan. Tujuannya agar kamu mampu menemukan konsep dan prinsip matematika melalui pemecahan masalah yang diajukan dan mendalami sifat-sifat yang terkandung di dalamnya yang sangat berguna untuk memecahkan masalah kehidupan. Tentu, penemuan konsep dan prinsip matematika tersebut dilakukan oleh kamu dan teman-teman dalam kelompok belajar dengan bimbingan guru.";
        String bhs = "Mata pelajaran Bahasa dan Sastra Indonesia di SMA dan MA ditujukan untuk mengembangkan kemampuan berkomunikasi baik secara lisan maupun tertulis. Oleh karena itu, melalui mata pelajaran ini diharapkan kamu dapat mengembangkan keterampilan mendengarkan, berbicara, membaca, dan menulis beraneka jenis wacana.\n" +
                "\n" +
                "Mata pelajaran Bahasa dan Sastra Indonesia di SMA dan MA juga ditujukan untuk mengembangkan pengalaman kegiatan bersastra. Oleh karena itu, melalui mata pelajaran ini juga diharapkan agar kamu memiliki pengalaman mendengarkan, berbicara, membaca, dan menulis berbagai jenis karya sastra. Selain itu, mata pelajaran Bahasa dan Sastra Indonesia di SMA dan MA juga ditujukan untuk mengembangkan berbagai kemampuan lebih lanjut dalam berbahasa dan bersastra. Oleh karena itu, diharapkan juga agar kamu menguasai berbagai konsep dasar kebahasaan dan kesastraan beserta penerapannya.";
        String ing = "Pesatnya perkembangan teknologi informasi dan komunikasi pada Abad 21 telah memosisikan bahasa Inggris sebagai salah satu bahasa utama dalam komunikasi antar bangsa dan pergaulan dunia. Kurikulum 2013 yang dirancang untuk menyongsong model pembelajaran Abad 21 menyadari pentingnya lulusan sekolah menengah atas menguasai bahasa Inggris untuk menyampaikan gagasan melebihi batas negara Indonesia serta untuk menyerap gagasan dari luar yang dapat dimanfaatkan untuk kemaslahatan bangsa dan negara.\n" +
                "\n" +
                "Sejalan dengan peran tersebut, buku Bahasa Inggris untuk SMA/MA/SMK/MAK ini bertujuan untuk membangun sikap, pengetahuan, dan keterampilan berkomunikasi siswa melalui pengalaman pembelajaran yang berbentuk beragam kegiatan berkomunikasi aktif, baik melalui kegiatan berbahasa Inggris yang bersifat reseptif maupun produktif. Hanya dengan terlibat aktif dalam kegiatan berkomunikasi, siswa dapat membangun sikap, pengetahuan, dan keterampilan berkomunikasi. Buku ini diharapkan mampu merealisasikan implementasi Kurikulum 2013 di dalam kelas bahasa Inggris karena isi dan pengalaman belajar yang dikembangkan dalam buku ini telah diupayakan agar dapat membantu siswa mencapai empat kompetensi inti (KI) dalam Kurikulum 2013.\n" +
                "\n" +
                "Penyajian isi dan pengalaman belajar dalam buku ini merujuk pada pendekatan pembelajaran bahasa berbasis teks, baik lisan maupun tulis, dengan menggunakan bahasa Inggris sebagai sarana berkomunikasi. Dengan memahami fungsi sosial, struktur teks, dan fitur kebahasaan berbagai teks seperti yang diamanahkan oleh Standar Isi dalam Kurikulum 2013, siswa diharapkan mampu mengungkapkan gagasan, baik secara lisan maupun tulis, dengan mengikuti kaidah dan langkah retorika yang sesuai. Di samping itu, isi dan pengalaman belajar pada setiap bab dalam buku ini pada umumnya disusun dengan mengikuti tahapan yang sesuai dengan prinsip dasar belajar bahasa asing, yaitu tahap penyajian atau pemodelan (presentation), tahap perlatihan (practice), dan tahap penggunaan (production).";

        buku1.add(new Buku("BIOLOGI 10","Ilmu Pengetahuan Alam","Praktis Belajar Biologi 1\nUntuk SMA/MA kelas X",bio,R.drawable.bio1));
        buku1.add(new Buku("BIOLOGI 11","Ilmu Pengetahuan Alam","Praktis Belajar Biologi 2\nUntuk SMA/MA kelas XI",bio,R.drawable.bio2));
        buku1.add(new Buku("BIOLOGI 12","Ilmu Pengetahuan Alam","Praktis Belajar Biologi 3\nUntuk SMA/MA kelas XII",bio,R.drawable.bio3));

        buku1.add(new Buku("FISIKA 10","Ilmu Pengetahuan Alam","Praktis Belajar Fisika 1\nUntuk SMA/MA kelas X",fis,R.drawable.fis1));
        buku1.add(new Buku("FISIKA 11","Ilmu Pengetahuan Alam","Praktis Belajar Fisika 2\nUntuk SMA/MA kelas XI",fis,R.drawable.fis2));
        buku1.add(new Buku("FISIKA 12","Ilmu Pengetahuan Alam","Praktis Belajar Fisika 3\nUntuk SMA/MA kelas XII",fis,R.drawable.fis3));

        buku1.add(new Buku("KIMIA 10","Ilmu Pengetahuan Alam","Praktis Belajar Kimia 1\nUntuk SMA/MA kelas X",kim,R.drawable.kim1));
        buku1.add(new Buku("KIMIA 11","Ilmu Pengetahuan Alam","Memahami KIMIA 2\nUntuk SMA/MA",kim,R.drawable.kim2));
        buku1.add(new Buku("KIMIA 12","Ilmu Pengetahuan Alam","Praktis Belajar Kimia 3\nUntuk SMA/MA kelas XII",kim,R.drawable.kim3));

        buku1.add(new Buku("MATEMATIKA 10","Matematika","Matematika Kelas X\nUntuk SMA/MA kelas X",mtk,R.drawable.mat1));
        buku1.add(new Buku("MATEMATIKA 11","Matematika","Matematika Kelas XI\nUntuk SMA/MA kelas XI",mtk,R.drawable.mat2));
        buku1.add(new Buku("MATEMATIKA 12","Matematika","Mahir Matematika Kelas 3\nUntuk SMA/MA kelas XII",mtk,R.drawable.mat3));

        buku1.add(new Buku("INDONESIA 10","Bahasa","Aku mampu berbahasa dan bersastra INDONESIA\nUntuk SMA/MA kelas X",bhs,R.drawable.ind1));
        buku1.add(new Buku("INDONESIA 11","Bahasa","Bahasa Indonesia\nUntuk SMA/MA kelas XI",bhs,R.drawable.ind2));
        buku1.add(new Buku("INDONESIA 12","Bahasa","Bahasa Indonesia\nUntuk SMA/MA kelas XII",bhs,R.drawable.ind3));

        buku1.add(new Buku("ENGLISH 10","Bahasa","Bahasa Inggris\nUntuk SMA/MA kelas X",ing,R.drawable.ing1));
        buku1.add(new Buku("ENGLISH 11","Bahasa","Developing English Competencies\nUntuk SMA/MA kelas XI",ing,R.drawable.ing2));
        buku1.add(new Buku("ENGLISH 12","Bahasa","Bahasa Inggris\nUntuk SMA/MA kelas XII",ing,R.drawable.ing3));

    }

    @Override
    public void onBackPressed() {
        showAlertDialog();
    }

    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setMessage("Tutup Aplikasi ?")
                .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        finish();
                    }
                })
                .setNegativeButton("Nanti", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}