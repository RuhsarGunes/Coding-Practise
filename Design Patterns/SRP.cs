using System;
using System.Collections.Generic;
using System.IO;
using static System.Console;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Diagnostics;

namespace SRP
{
    //just stores a couple of entries and ways of working with them.
    public class Journal
    {
        private readonly List<string> entries = new List<string>();
        private static int count = 0;
        
        public int AddEntry(string text)
        {
            entries.Add($"{++count}: {text}");
            return count; // memento pattern!
        }

        public void RemoveEntry(int index)
        {
            entries.RemoveAt(index);
        }

        public override string ToString()
        {
            return string.Join(Environment.NewLine, entries);
        }

        //breaks single responsibility of persisting objects
        public void Save(string filename, bool overwrite = false)
        {
            File.WriteAllText(filename, ToString());

        }
        public void Load(string filename)
        {

        }
        public void Load(Uri uri)
        {

        }

    }
    
    // handles the responsibility of persisting objects.
    public class Persistence
    {
        public void SaveToFile(Journal journal, string filename, bool overwrite = false)
        {
            if (overwrite || !File.Exists(filename))
                File.WriteAllText(filename, journal.ToString());
        }
    }

    class SRP
    {
        static void Main(string[] args)
        {
            var j = new Journal();
            j.AddEntry("I cried today");
            j.AddEntry("I ate a bug");
            WriteLine(j);

            var p = new Persistence();
            var filename = @"d:\DesignPatterNs\journal.txt";
            p.SaveToFile(j, filename);
            Process.Start(filename);//This code assumes the process you are starting will terminate itself. 
                                    
        }
    }
}
